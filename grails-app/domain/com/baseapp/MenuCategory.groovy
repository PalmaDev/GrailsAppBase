package com.baseapp

class MenuCategory {

  String categoryName
  boolean enabled = true
  Long parent

  static constraints = {
    categoryName nullable:false, size:1..80
    parent nullable:true
  }

}
