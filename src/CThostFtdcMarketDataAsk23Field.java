/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcMarketDataAsk23Field {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcMarketDataAsk23Field(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcMarketDataAsk23Field obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcMarketDataAsk23Field(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setAskPrice2(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskPrice2_set(swigCPtr, this, value);
  }

  public double getAskPrice2() {
    return thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskPrice2_get(swigCPtr, this);
  }

  public void setAskVolume2(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskVolume2_set(swigCPtr, this, value);
  }

  public int getAskVolume2() {
    return thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskVolume2_get(swigCPtr, this);
  }

  public void setAskPrice3(double value) {
    thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskPrice3_set(swigCPtr, this, value);
  }

  public double getAskPrice3() {
    return thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskPrice3_get(swigCPtr, this);
  }

  public void setAskVolume3(int value) {
    thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskVolume3_set(swigCPtr, this, value);
  }

  public int getAskVolume3() {
    return thosttraderapiJNI.CThostFtdcMarketDataAsk23Field_AskVolume3_get(swigCPtr, this);
  }

  public CThostFtdcMarketDataAsk23Field() {
    this(thosttraderapiJNI.new_CThostFtdcMarketDataAsk23Field(), true);
  }

}
