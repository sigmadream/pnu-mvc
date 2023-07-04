package com.sangkon.mvc;

import com.sangkon.mvc.controller.Controller;

public interface HandlerMapping {
    Object  findHandler(HandlerKey handlerKey);
}