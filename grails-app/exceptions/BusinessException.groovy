package com.baseapp

class BusinessException extends RuntimeException {

  BusinessException(String msg) {
    super(msg)
  }

  String getMessage() {
    super.message
  }

}
