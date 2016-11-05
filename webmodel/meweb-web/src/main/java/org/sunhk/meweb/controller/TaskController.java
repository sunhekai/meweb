package org.sunhk.meweb.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.sunhk.meweb.model.Task;
import org.sunhk.meweb.service.ITaskService;
import org.sunhk.meweb.service.SysUserService;

@Controller
public class TaskController {
	@Autowired
	private ITaskService taskService;
	@Autowired
	private SysUserService userSevice;

	@RequestMapping(value = "/admin/testtask")
	public @ResponseBody Object getJSON(@RequestBody Task task) {
		return taskService.insertTask(task);
		// return userSevice.findUserByName(task.getUsername());
	}

	@RequestMapping(value = "/admin/gettask")
	public @ResponseBody Object getJSON() {
		return taskService.selectUndoTask();
		// return userSevice.findUserByName(task.getUsername());
	}

	@RequestMapping(value = "/admin/testexport")
	public void testExport(HttpServletRequest request, HttpServletResponse response) {
		String taskid = request.getParameter("taskid");
		response.setContentType("application/vnd.ms-excel");
		String codedFileName = null;
		OutputStream fOut = null;
		try {
			// 进行转码，使其支持中文文件名
			codedFileName = java.net.URLEncoder.encode("中文", "UTF-8");
			response.setHeader("content-disposition", "attachment;filename=" + codedFileName + ".xls");
			// response.addHeader("Content-Disposition", "attachment; filename="
			// + codedFileName + ".xls");
			// 产生工作簿对象
			HSSFWorkbook workbook = new HSSFWorkbook();
			// 产生工作表对象
			HSSFSheet sheet = workbook.createSheet();
			for (int i = 0; i <= 30000; i++) {
				HSSFRow row = sheet.createRow((int) i);// 创建一行
				HSSFCell cell = row.createCell((int) 0);// 创建一列
				cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				cell.setCellValue("测试成功" + i);
			}
			fOut = response.getOutputStream();
			workbook.write(fOut);
		} catch (UnsupportedEncodingException e1) {
		} catch (Exception e) {
		} finally {
			try {
				fOut.flush();
				fOut.close();
			} catch (IOException e) {
			}
		}
		System.out.println("文件生成...");
	}
}
