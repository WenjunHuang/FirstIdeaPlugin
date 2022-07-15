// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

package com.github.wenjunhuang.restTools.ui

import com.intellij.openapi.project.Project
import com.intellij.openapi.wm.{ToolWindow, ToolWindowFactory}
import com.intellij.ui.components.JBLabel
import com.intellij.ui.content.{Content, ContentFactory}
import com.intellij.uiDesigner.core.{GridConstraints, GridLayoutManager}

import java.util.Calendar
import javax.swing.{ImageIcon, JButton, JLabel, JPanel}
import scala.swing._

class MyToolWindowFactory extends ToolWindowFactory {

  override def createToolWindowContent(
      project: Project,
      toolWindow: ToolWindow
  ): Unit = {
    val contentFactory = ContentFactory.SERVICE.getInstance
    val content = contentFactory.createContent(
      MyToolWindowFactory.createContent(),
      "",
      false
    )
    toolWindow.getContentManager.addContent(content)
  }
}

object MyToolWindowFactory {
  def createContent(): JPanel = {
    val content = new JPanel()
    val layout = new GridLayoutManager(2, 5)
    content.setLayout(layout)

    val currentDate = new JLabel()
    currentDate.setText("Date2")
    val constraints = new GridConstraints()
    constraints.setRow(0)
    constraints.setColumn(1)
    constraints.setRowSpan(1)
    constraints.setColSpan(1)
    content.add(currentDate, constraints)

    val refreshToolWindowButton = new JButton("Refresh")
    refreshToolWindowButton.addActionListener(e => {
      val ci = Calendar.getInstance()
      currentDate.setText(s"${ci.get(Calendar.DAY_OF_MONTH)}/${ci
        .get(Calendar.MONTH) + 1}/${ci.get(Calendar.YEAR)}")
      currentDate.setIcon(
        new ImageIcon(
          classOf[MyToolWindowFactory].getResource(
            "/toolWindow/Calendar-icon.png"
          )
        )
      )
    })
    constraints.setRow(1)
    constraints.setColumn(1)
    content.add(refreshToolWindowButton, constraints)

    content
  }

//  def createContent2() = new GridBagPanel{
//
//  }
}
