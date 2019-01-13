/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcReserveOpenAccountConfirmField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcReserveOpenAccountConfirmField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcReserveOpenAccountConfirmField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcReserveOpenAccountConfirmField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setGender(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Gender_set(swigCPtr, this, value);
  }

  public char getGender() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Gender_get(swigCPtr, this);
  }

  public void setCountryCode(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_set(swigCPtr, this, value);
  }

  public String getCountryCode() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CountryCode_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CustType_get(swigCPtr, this);
  }

  public void setAddress(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Address_set(swigCPtr, this, value);
  }

  public String getAddress() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Address_get(swigCPtr, this);
  }

  public void setZipCode(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_set(swigCPtr, this, value);
  }

  public String getZipCode() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ZipCode_get(swigCPtr, this);
  }

  public void setTelephone(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_set(swigCPtr, this, value);
  }

  public String getTelephone() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Telephone_get(swigCPtr, this);
  }

  public void setMobilePhone(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_set(swigCPtr, this, value);
  }

  public String getMobilePhone() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_MobilePhone_get(swigCPtr, this);
  }

  public void setFax(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Fax_set(swigCPtr, this, value);
  }

  public String getFax() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Fax_get(swigCPtr, this);
  }

  public void setEMail(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_EMail_set(swigCPtr, this, value);
  }

  public String getEMail() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_EMail_get(swigCPtr, this);
  }

  public void setMoneyAccountStatus(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_set(swigCPtr, this, value);
  }

  public char getMoneyAccountStatus() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_MoneyAccountStatus_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankPassWord_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_InstallID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_CurrencyID_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_TID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_Password_get(swigCPtr, this);
  }

  public void setBankReserveOpenSeq(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_set(swigCPtr, this, value);
  }

  public String getBankReserveOpenSeq() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BankReserveOpenSeq_get(swigCPtr, this);
  }

  public void setBookDate(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_set(swigCPtr, this, value);
  }

  public String getBookDate() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BookDate_get(swigCPtr, this);
  }

  public void setBookPsw(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_set(swigCPtr, this, value);
  }

  public String getBookPsw() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_BookPsw_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttraderapiJNI.CThostFtdcReserveOpenAccountConfirmField_ErrorMsg_get(swigCPtr, this);
  }

  public CThostFtdcReserveOpenAccountConfirmField() {
    this(thosttraderapiJNI.new_CThostFtdcReserveOpenAccountConfirmField(), true);
  }

}
