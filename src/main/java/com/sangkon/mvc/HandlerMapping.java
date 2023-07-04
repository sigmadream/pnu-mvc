package com.sangkon.mvc;

import com.sangkon.mvc.controller.Controller;

public interface HandlerMapping {
    Controller findHandler(HandlerKey handlerKey);
}