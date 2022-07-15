package com.github.wenjunhuang.restTools.actions

import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.project.DumbAwareAction
import com.intellij.openapi.project.Project

class NewRequestInToolMenuAction extends DumbAwareAction:
  override def actionPerformed(e: AnActionEvent): Unit =
    e.getProject match
      case project: Project if !project.isDefault =>

      case _ =>




