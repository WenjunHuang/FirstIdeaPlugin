package com.github.wenjunhuang.restTools

import com.intellij.DynamicBundle

object RestClientBundle extends DynamicBundle("messages.RESTToolsBundle"):
  def message(key: String, params: AnyRef*):String =
    super.getMessage(key, params)

end RestClientBundle
