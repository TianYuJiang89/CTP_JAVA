/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcInputQuoteActionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInputQuoteActionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInputQuoteActionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcInputQuoteActionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_InvestorID_get(swigCPtr, this);
  }

  public void setQuoteActionRef(int value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_set(swigCPtr, this, value);
  }

  public int getQuoteActionRef() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteActionRef_get(swigCPtr, this);
  }

  public void setQuoteRef(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_set(swigCPtr, this, value);
  }

  public String getQuoteRef() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteRef_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_RequestID_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_SessionID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_ExchangeID_get(swigCPtr, this);
  }

  public void setQuoteSysID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_set(swigCPtr, this, value);
  }

  public String getQuoteSysID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_QuoteSysID_get(swigCPtr, this);
  }

  public void setActionFlag(char value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_set(swigCPtr, this, value);
  }

  public char getActionFlag() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_ActionFlag_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_UserID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_InstrumentID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_InvestUnitID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_ClientID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcInputQuoteActionField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcInputQuoteActionField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcInputQuoteActionField() {
    this(thosttraderapiJNI.new_CThostFtdcInputQuoteActionField(), true);
  }

}