/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcExchangeRateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeRateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeRateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcExchangeRateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeRateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcExchangeRateField_BrokerID_get(swigCPtr, this);
  }

  public void setFromCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeRateField_FromCurrencyID_set(swigCPtr, this, value);
  }

  public String getFromCurrencyID() {
    return thosttraderapiJNI.CThostFtdcExchangeRateField_FromCurrencyID_get(swigCPtr, this);
  }

  public void setFromCurrencyUnit(double value) {
    thosttraderapiJNI.CThostFtdcExchangeRateField_FromCurrencyUnit_set(swigCPtr, this, value);
  }

  public double getFromCurrencyUnit() {
    return thosttraderapiJNI.CThostFtdcExchangeRateField_FromCurrencyUnit_get(swigCPtr, this);
  }

  public void setToCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeRateField_ToCurrencyID_set(swigCPtr, this, value);
  }

  public String getToCurrencyID() {
    return thosttraderapiJNI.CThostFtdcExchangeRateField_ToCurrencyID_get(swigCPtr, this);
  }

  public void setExchangeRate(double value) {
    thosttraderapiJNI.CThostFtdcExchangeRateField_ExchangeRate_set(swigCPtr, this, value);
  }

  public double getExchangeRate() {
    return thosttraderapiJNI.CThostFtdcExchangeRateField_ExchangeRate_get(swigCPtr, this);
  }

  public CThostFtdcExchangeRateField() {
    this(thosttraderapiJNI.new_CThostFtdcExchangeRateField(), true);
  }

}
