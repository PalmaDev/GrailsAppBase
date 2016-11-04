package com.siscaim

class Menu {
  String name
  Boolean enabled
  ClasificationMenu parent

  static hasMany = [operations:Operation]

  static constraints = {
    name blank:false
    parent nullable:true
  }
}
