/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcErrorConditionalOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcErrorConditionalOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcErrorConditionalOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcErrorConditionalOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InvestorID_get(swigCPtr, this);
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InstrumentID_get(swigCPtr, this);
  }

  public void setOrderRef(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderRef_set(swigCPtr, this, value);
  }

  public String getOrderRef() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderRef_get(swigCPtr, this);
  }

  public void setUserID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserID_set(swigCPtr, this, value);
  }

  public String getUserID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserID_get(swigCPtr, this);
  }

  public void setOrderPriceType(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setFrontID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_FrontID_set(swigCPtr, this, value);
  }

  public int getFrontID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_FrontID_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_SessionID_get(swigCPtr, this);
  }

  public void setUserProductInfo(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserProductInfo_set(swigCPtr, this, value);
  }

  public String getUserProductInfo() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserProductInfo_get(swigCPtr, this);
  }

  public void setStatusMsg(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_StatusMsg_set(swigCPtr, this, value);
  }

  public String getStatusMsg() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_StatusMsg_get(swigCPtr, this);
  }

  public void setUserForceClose(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserForceClose_set(swigCPtr, this, value);
  }

  public int getUserForceClose() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_UserForceClose_get(swigCPtr, this);
  }

  public void setActiveUserID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveUserID_set(swigCPtr, this, value);
  }

  public String getActiveUserID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ActiveUserID_get(swigCPtr, this);
  }

  public void setBrokerOrderSeq(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BrokerOrderSeq_set(swigCPtr, this, value);
  }

  public int getBrokerOrderSeq() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BrokerOrderSeq_get(swigCPtr, this);
  }

  public void setRelativeOrderSysID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_RelativeOrderSysID_set(swigCPtr, this, value);
  }

  public String getRelativeOrderSysID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_RelativeOrderSysID_get(swigCPtr, this);
  }

  public void setZCETotalTradedVolume(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ZCETotalTradedVolume_set(swigCPtr, this, value);
  }

  public int getZCETotalTradedVolume() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ZCETotalTradedVolume_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_ErrorMsg_get(swigCPtr, this);
  }

  public void setIsSwapOrder(int value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IsSwapOrder_set(swigCPtr, this, value);
  }

  public int getIsSwapOrder() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IsSwapOrder_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_BranchID_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_InvestUnitID_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_AccountID_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_CurrencyID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcErrorConditionalOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcErrorConditionalOrderField() {
    this(thosttraderapiJNI.new_CThostFtdcErrorConditionalOrderField(), true);
  }

}
