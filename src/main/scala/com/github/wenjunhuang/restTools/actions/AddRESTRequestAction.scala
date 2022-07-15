package com.github.wenjunhuang.restTools.actions
import com.github.wenjunhuang.restTools.request.RESTRequestFileType
import com.intellij.codeInsight.template.Template
import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent}
import com.intellij.openapi.editor.Editor
import com.intellij.openapi.project.Project
import com.intellij.util.PathUtil

class AddRESTRequestAction extends AnAction:
  override def update(e: AnActionEvent): Unit = super.update(e)

  override def actionPerformed(e: AnActionEvent): Unit = ???

object AddRESTRequestAction:
  def performLiveTemplateAction(project: Project, editor: Editor, liveTemplateName: String, event: AnActionEvent) = ???

//  def createScratchFileAndStartTemplate(project: Project,event: AnActionEvent, template: Template) =
//    val fileName = PathUtil.makeFileName("rest-api",RESTRequestFileType)
