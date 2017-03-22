package com.baseapp

class MenuOperation {

  String operationName
  MenuCategory category
  boolean enabled = true

  static constraints = {
    operationName nullable:false, size:1..80
    category nullable:false
  }

}
