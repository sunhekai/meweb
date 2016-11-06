package org.sunhk.meweb.service.impl;

import org.springframework.stereotype.Service;
import org.sunhk.meweb.service.WebSocketService;

@Service(value="webSocketService")
public class WebSocketServiceImpl implements WebSocketService {

	@Override
	public int getUnReadNews(String string) {
		return 1;
	}

}
