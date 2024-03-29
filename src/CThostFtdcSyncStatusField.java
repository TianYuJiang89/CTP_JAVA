/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcSyncStatusField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcSyncStatusField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcSyncStatusField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcSyncStatusField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcSyncStatusField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcSyncStatusField_TradingDay_get(swigCPtr, this);
  }

  public void setDataSyncStatus(char value) {
    thosttraderapiJNI.CThostFtdcSyncStatusField_DataSyncStatus_set(swigCPtr, this, value);
  }

  public char getDataSyncStatus() {
    return thosttraderapiJNI.CThostFtdcSyncStatusField_DataSyncStatus_get(swigCPtr, this);
  }

  public CThostFtdcSyncStatusField() {
    this(thosttraderapiJNI.new_CThostFtdcSyncStatusField(), true);
  }

}
