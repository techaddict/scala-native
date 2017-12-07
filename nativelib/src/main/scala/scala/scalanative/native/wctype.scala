package scala.scalanative
package native

@extern
object wctype {
  type wint_t = UInt
  type wctrans_t = UInt
  type wctype_t = UInt

  // Character classification
  def iswalnum(ch: wint_t): CInt = extern
  def iswalpha(ch: wint_t): CInt  = extern
  def iswlower(ch: wint_t): CInt  = extern
  def iswupper(ch: wint_t): CInt  = extern
  def iswdigit(ch: wint_t): CInt  = extern
  def iswxdigit(ch: wint_t): CInt  = extern
  def iswcntrl(ch: wint_t): CInt  = extern
  def iswgraph(ch: wint_t): CInt  = extern
  def iswspace(ch: wint_t): CInt  = extern
  def iswblank(ch: wint_t): CInt  = extern
  def iswprint(ch: wint_t): CInt  = extern
  def iswpunct(ch: wint_t): CInt  = extern
  def iswctype(ch: wint_t, desc: wctype_t): CInt = extern
  def wctype(str: Ptr[CChar]): wctype_t  = extern

  // Character manipulation
  def towlower(ch: wint_t): wint_t  = extern
  def towupper(ch: wint_t): wint_t  = extern
  def towctrans(ch: wint_t, desc: wctrans_t): wint_t  = extern
  def wctrans(str: Ptr[CChar]): wctrans_t  = extern
}
