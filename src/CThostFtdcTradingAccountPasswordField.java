/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcTradingAccountPasswordField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcTradingAccountPasswordField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcTradingAccountPasswordField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcTradingAccountPasswordField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_BrokerID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcTradingAccountPasswordField_CurrencyID_get(swigCPtr, this);
  }

  public CThostFtdcTradingAccountPasswordField() {
    this(thosttraderapiJNI.new_CThostFtdcTradingAccountPasswordField(), true);
  }

}
