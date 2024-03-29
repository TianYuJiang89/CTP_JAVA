/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcRspTransferField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspTransferField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspTransferField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcRspTransferField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_SessionID_get(swigCPtr, this);
  }

  public void setCustomerName(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_CustomerName_set(swigCPtr, this, value);
  }

  public String getCustomerName() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_CustomerName_get(swigCPtr, this);
  }

  public void setIdCardType(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_IdCardType_set(swigCPtr, this, value);
  }

  public char getIdCardType() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_IdCardType_get(swigCPtr, this);
  }

  public void setIdentifiedCardNo(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_set(swigCPtr, this, value);
  }

  public String getIdentifiedCardNo() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_IdentifiedCardNo_get(swigCPtr, this);
  }

  public void setCustType(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_CustType_set(swigCPtr, this, value);
  }

  public char getCustType() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_CustType_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_Password_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_InstallID_get(swigCPtr, this);
  }

  public void setFutureSerial(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_FutureSerial_set(swigCPtr, this, value);
  }

  public int getFutureSerial() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_FutureSerial_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_UserID_get(swigCPtr, this);
  }

  public void setVerifyCertNoFlag(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_set(swigCPtr, this, value);
  }

  public char getVerifyCertNoFlag() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_VerifyCertNoFlag_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TradeAmount_get(swigCPtr, this);
  }

  public void setFutureFetchAmount(double value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_FutureFetchAmount_set(swigCPtr, this, value);
  }

  public double getFutureFetchAmount() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_FutureFetchAmount_get(swigCPtr, this);
  }

  public void setFeePayFlag(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_FeePayFlag_set(swigCPtr, this, value);
  }

  public char getFeePayFlag() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_FeePayFlag_get(swigCPtr, this);
  }

  public void setCustFee(double value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_CustFee_set(swigCPtr, this, value);
  }

  public double getCustFee() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_CustFee_get(swigCPtr, this);
  }

  public void setBrokerFee(double value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BrokerFee_set(swigCPtr, this, value);
  }

  public double getBrokerFee() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BrokerFee_get(swigCPtr, this);
  }

  public void setMessage(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_Message_set(swigCPtr, this, value);
  }

  public String getMessage() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_Message_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_Digest_get(swigCPtr, this);
  }

  public void setBankAccType(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankAccType_set(swigCPtr, this, value);
  }

  public char getBankAccType() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankAccType_get(swigCPtr, this);
  }

  public void setDeviceID(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_DeviceID_set(swigCPtr, this, value);
  }

  public String getDeviceID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_DeviceID_get(swigCPtr, this);
  }

  public void setBankSecuAccType(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankSecuAccType_set(swigCPtr, this, value);
  }

  public char getBankSecuAccType() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankSecuAccType_get(swigCPtr, this);
  }

  public void setBrokerIDByBank(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BrokerIDByBank_set(swigCPtr, this, value);
  }

  public String getBrokerIDByBank() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BrokerIDByBank_get(swigCPtr, this);
  }

  public void setBankSecuAcc(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankSecuAcc_set(swigCPtr, this, value);
  }

  public String getBankSecuAcc() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankSecuAcc_get(swigCPtr, this);
  }

  public void setBankPwdFlag(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_BankPwdFlag_set(swigCPtr, this, value);
  }

  public char getBankPwdFlag() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_BankPwdFlag_get(swigCPtr, this);
  }

  public void setSecuPwdFlag(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_SecuPwdFlag_set(swigCPtr, this, value);
  }

  public char getSecuPwdFlag() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_SecuPwdFlag_get(swigCPtr, this);
  }

  public void setOperNo(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_OperNo_set(swigCPtr, this, value);
  }

  public String getOperNo() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_OperNo_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_RequestID_get(swigCPtr, this);
  }

  public void setTID(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TID_set(swigCPtr, this, value);
  }

  public int getTID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TID_get(swigCPtr, this);
  }

  public void setTransferStatus(char value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_TransferStatus_set(swigCPtr, this, value);
  }

  public char getTransferStatus() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_TransferStatus_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_ErrorMsg_get(swigCPtr, this);
  }

  public void setLongCustomerName(String value) {
    thosttraderapiJNI.CThostFtdcRspTransferField_LongCustomerName_set(swigCPtr, this, value);
  }

  public String getLongCustomerName() {
    return thosttraderapiJNI.CThostFtdcRspTransferField_LongCustomerName_get(swigCPtr, this);
  }

  public CThostFtdcRspTransferField() {
    this(thosttraderapiJNI.new_CThostFtdcRspTransferField(), true);
  }

}
