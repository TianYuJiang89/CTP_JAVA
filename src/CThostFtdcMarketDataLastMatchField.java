/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcMarketDataLastMatchField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataLastMatchField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataLastMatchField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcMarketDataLastMatchField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setLastPrice(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_set(swigCPtr, this, value);
  }

  public double getLastPrice() {
    return thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_LastPrice_get(swigCPtr, this);
  }

  public void setVolume(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_Volume_set(swigCPtr, this, value);
  }

  public int getVolume() {
    return thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_Volume_get(swigCPtr, this);
  }

  public void setTurnover(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_Turnover_set(swigCPtr, this, value);
  }

  public double getTurnover() {
    return thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_Turnover_get(swigCPtr, this);
  }

  public void setOpenInterest(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_set(swigCPtr, this, value);
  }

  public double getOpenInterest() {
    return thosttraderapiJNI.CThostFtdcMarketDataLastMatchField_OpenInterest_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataLastMatchField() {
    this(thosttraderapiJNI.new_CThostFtdcMarketDataLastMatchField(), true);
  }

}
