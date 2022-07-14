// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.jetbrains.scala.samples.actions

import com.intellij.lang.Language
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import com.intellij.pom.Navigatable
import org.jetbrains.annotations.{Nls, NotNull, Nullable}
import org.jetbrains.scala.samples.SamplePluginBundle
import org.jetbrains.scala.samples.services.{
  ApplicationHelloService,
  ProjectHelloService
}

import javax.swing.*

class PopupDialogAction extends AnAction():
  override def actionPerformed(e: AnActionEvent): Unit =
    Messages.showInfoMessage("Hello world", "Title")

  override def update(e: AnActionEvent): Unit =
    e.getData(CommonDataKeys.LANGUAGE) match
      case language: Language =>
        if language.getDisplayName == "Java" then
          e.getPresentation.setText("You opened a java file!")
          e.getPresentation.setEnabled(true)
        else
          e.getPresentation.setEnabled(false)
          e.getPresentation.setText("Not supported file!")
      case null =>
