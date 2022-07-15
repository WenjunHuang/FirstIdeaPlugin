// This is a generated file. Not intended for manual editing.
package com.github.wenjunhuang.restTools.request.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.wenjunhuang.restTools.request.psi.impl.*;

public interface RESTRequestElementTypes {

  IElementType PROPERTY = new RESTRequestElementType("PROPERTY");

  IElementType COMMENT = new RESTRequestTokenType("COMMENT");
  IElementType CRLF = new RESTRequestTokenType("CRLF");
  IElementType KEY = new RESTRequestTokenType("KEY");
  IElementType SEPARATOR = new RESTRequestTokenType("SEPARATOR");
  IElementType VALUE = new RESTRequestTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new RESTRequestPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
