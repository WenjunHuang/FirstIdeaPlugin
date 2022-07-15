package com.github.wenjunhuang.restTools.actions

import com.intellij.lang.Language
import com.intellij.openapi.actionSystem.{AnAction, AnActionEvent, CommonDataKeys}
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.pom.Navigatable
import org.jetbrains.annotations.{Nls, NotNull, Nullable}

import javax.swing.*

class PopupDialogAction extends AnAction():
  override def actionPerformed(e: AnActionEvent): Unit =
    Messages.showInfoMessage("Hello world", "Title")

//  override def update(e: AnActionEvent): Unit =
//    e.getData(CommonDataKeys.LANGUAGE) match
//      case language: Language =>
//        if language.getDisplayName == "Java" then
//          e.getPresentation.setText("You opened a java file!")
//          e.getPresentation.setEnabled(true)
//        else
//          e.getPresentation.setEnabled(false)
//          e.getPresentation.setText("Not supported file!")
//      case null =>
