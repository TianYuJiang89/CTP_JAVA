/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcUserPasswordUpdateField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcUserPasswordUpdateField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcUserPasswordUpdateField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcUserPasswordUpdateField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_BrokerID_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_UserID_get(swigCPtr, this);
  }

  public void setOldPassword(String value) {
    thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_set(swigCPtr, this, value);
  }

  public String getOldPassword() {
    return thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_OldPassword_get(swigCPtr, this);
  }

  public void setNewPassword(String value) {
    thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_set(swigCPtr, this, value);
  }

  public String getNewPassword() {
    return thosttraderapiJNI.CThostFtdcUserPasswordUpdateField_NewPassword_get(swigCPtr, this);
  }

  public CThostFtdcUserPasswordUpdateField() {
    this(thosttraderapiJNI.new_CThostFtdcUserPasswordUpdateField(), true);
  }

}