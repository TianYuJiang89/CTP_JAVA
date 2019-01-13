/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcOptionInstrMarginAdjustField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcOptionInstrMarginAdjustField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcOptionInstrMarginAdjustField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcOptionInstrMarginAdjustField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestorRange(char value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorRange_set(swigCPtr, this, value);
  }

  public char getInvestorRange() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorRange_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_InvestorID_get(swigCPtr, this);
  }

  public void setSShortMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getSShortMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setSShortMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getSShortMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_SShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setHShortMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getHShortMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setHShortMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getHShortMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_HShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setAShortMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getAShortMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setAShortMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getAShortMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_AShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public void setIsRelative(int value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_IsRelative_set(swigCPtr, this, value);
  }

  public int getIsRelative() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_IsRelative_get(swigCPtr, this);
  }

  public void setMShortMarginRatioByMoney(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByMoney_set(swigCPtr, this, value);
  }

  public double getMShortMarginRatioByMoney() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByMoney_get(swigCPtr, this);
  }

  public void setMShortMarginRatioByVolume(double value) {
    thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByVolume_set(swigCPtr, this, value);
  }

  public double getMShortMarginRatioByVolume() {
    return thosttraderapiJNI.CThostFtdcOptionInstrMarginAdjustField_MShortMarginRatioByVolume_get(swigCPtr, this);
  }

  public CThostFtdcOptionInstrMarginAdjustField() {
    this(thosttraderapiJNI.new_CThostFtdcOptionInstrMarginAdjustField(), true);
  }

}
