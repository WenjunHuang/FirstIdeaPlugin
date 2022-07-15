package com.github.wenjunhuang.restTools.request

import com.github.wenjunhuang.restTools.RestClientBundle
import com.github.wenjunhuang.restTools.request.RESTRequestFileType.kDescriptionId
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.fileTypes.LanguageFileType
import com.intellij.util.PlatformIcons

import java.util.MissingResourceException
import javax.swing.Icon

object RESTRequestFileType extends LanguageFileType(RESTRequestLanguage):
  override def getName: String = "REST Request"

  override def getDescription: String = RestClientBundle.message(kDescriptionId)

  override def getDefaultExtension: String = "http"

  override def getIcon: Icon = PlatformIcons.FILE_ICON

  val kDescriptionId = "filetype.http.request.action.description"
end RESTRequestFileType
