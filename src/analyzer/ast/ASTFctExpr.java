package analyzer.ast;/* Generated By:JJTree: Do not edit this line. ASTFctExpr.java */

public class ASTFctExpr extends SimpleNode {
  public ASTFctExpr(int id) {
    super(id);
  }

  public ASTFctExpr(Parser p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(ParserVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  // PLB
  private String m_value = null;
  public void setValue(String v) { m_value = v; }
  public String getValue() { return m_value; }
}
