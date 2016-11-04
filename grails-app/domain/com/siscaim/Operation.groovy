package com.siscaim

class Operation {
  String name
  String controller
  String action
  Boolean enabled

  static belongsTo = [menu:Menu]

  static constraints = {
    name blank:false, size:1..80
    controller blank:false
    action blank:false
  }
}
