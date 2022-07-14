package org.jetbrains.scala.samples.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.content.ContentFactory
import com.intellij.ui.treeStructure.Tree

import java.time.ZoneId
import javax.swing.{JComponent, JPanel}
import javax.swing.tree.TreeModel
import scala.swing.*

class TimeZoneTableWindow extends ToolWindowFactory:
  override def createToolWindowContent(project: Project, toolWindow: ToolWindow): Unit =
    val contentFactory = ContentFactory.SERVICE.getInstance()
    val content = contentFactory.createContent(TimeZoneTableWindow.creatContent().asInstanceOf[JComponent],
      "",
      false
    )
    toolWindow.getContentManager.addContent(content)

object TimeZoneTableWindow:
  def creatContent() =
    val zoneIds = ZoneId.getAvailableZoneIds
    val tree = Tree()
    tree
