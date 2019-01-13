/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcExchangeOrderField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcExchangeOrderField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcExchangeOrderField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcExchangeOrderField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setOrderPriceType(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderPriceType_set(swigCPtr, this, value);
  }

  public char getOrderPriceType() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderPriceType_get(swigCPtr, this);
  }

  public void setDirection(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_Direction_set(swigCPtr, this, value);
  }

  public char getDirection() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_Direction_get(swigCPtr, this);
  }

  public void setCombOffsetFlag(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_set(swigCPtr, this, value);
  }

  public String getCombOffsetFlag() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_CombOffsetFlag_get(swigCPtr, this);
  }

  public void setCombHedgeFlag(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_set(swigCPtr, this, value);
  }

  public String getCombHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_CombHedgeFlag_get(swigCPtr, this);
  }

  public void setLimitPrice(double value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_LimitPrice_set(swigCPtr, this, value);
  }

  public double getLimitPrice() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_LimitPrice_get(swigCPtr, this);
  }

  public void setVolumeTotalOriginal(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_set(swigCPtr, this, value);
  }

  public int getVolumeTotalOriginal() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTotalOriginal_get(swigCPtr, this);
  }

  public void setTimeCondition(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_TimeCondition_set(swigCPtr, this, value);
  }

  public char getTimeCondition() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_TimeCondition_get(swigCPtr, this);
  }

  public void setGTDDate(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_GTDDate_set(swigCPtr, this, value);
  }

  public String getGTDDate() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_GTDDate_get(swigCPtr, this);
  }

  public void setVolumeCondition(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeCondition_set(swigCPtr, this, value);
  }

  public char getVolumeCondition() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeCondition_get(swigCPtr, this);
  }

  public void setMinVolume(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_MinVolume_set(swigCPtr, this, value);
  }

  public int getMinVolume() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_MinVolume_get(swigCPtr, this);
  }

  public void setContingentCondition(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ContingentCondition_set(swigCPtr, this, value);
  }

  public char getContingentCondition() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ContingentCondition_get(swigCPtr, this);
  }

  public void setStopPrice(double value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_StopPrice_set(swigCPtr, this, value);
  }

  public double getStopPrice() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_StopPrice_get(swigCPtr, this);
  }

  public void setForceCloseReason(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_set(swigCPtr, this, value);
  }

  public char getForceCloseReason() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ForceCloseReason_get(swigCPtr, this);
  }

  public void setIsAutoSuspend(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_set(swigCPtr, this, value);
  }

  public int getIsAutoSuspend() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_IsAutoSuspend_get(swigCPtr, this);
  }

  public void setBusinessUnit(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_BusinessUnit_set(swigCPtr, this, value);
  }

  public String getBusinessUnit() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_BusinessUnit_get(swigCPtr, this);
  }

  public void setRequestID(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_RequestID_set(swigCPtr, this, value);
  }

  public int getRequestID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_RequestID_get(swigCPtr, this);
  }

  public void setOrderLocalID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderLocalID_set(swigCPtr, this, value);
  }

  public String getOrderLocalID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderLocalID_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ExchangeID_get(swigCPtr, this);
  }

  public void setParticipantID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ParticipantID_set(swigCPtr, this, value);
  }

  public String getParticipantID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ParticipantID_get(swigCPtr, this);
  }

  public void setClientID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ClientID_set(swigCPtr, this, value);
  }

  public String getClientID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ClientID_get(swigCPtr, this);
  }

  public void setExchangeInstID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_set(swigCPtr, this, value);
  }

  public String getExchangeInstID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ExchangeInstID_get(swigCPtr, this);
  }

  public void setTraderID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_TraderID_set(swigCPtr, this, value);
  }

  public String getTraderID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_TraderID_get(swigCPtr, this);
  }

  public void setInstallID(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_InstallID_set(swigCPtr, this, value);
  }

  public int getInstallID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_InstallID_get(swigCPtr, this);
  }

  public void setOrderSubmitStatus(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_set(swigCPtr, this, value);
  }

  public char getOrderSubmitStatus() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSubmitStatus_get(swigCPtr, this);
  }

  public void setNotifySequence(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_NotifySequence_set(swigCPtr, this, value);
  }

  public int getNotifySequence() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_NotifySequence_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_SettlementID_get(swigCPtr, this);
  }

  public void setOrderSysID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSysID_set(swigCPtr, this, value);
  }

  public String getOrderSysID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSysID_get(swigCPtr, this);
  }

  public void setOrderSource(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSource_set(swigCPtr, this, value);
  }

  public char getOrderSource() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderSource_get(swigCPtr, this);
  }

  public void setOrderStatus(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderStatus_set(swigCPtr, this, value);
  }

  public char getOrderStatus() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderStatus_get(swigCPtr, this);
  }

  public void setOrderType(char value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderType_set(swigCPtr, this, value);
  }

  public char getOrderType() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_OrderType_get(swigCPtr, this);
  }

  public void setVolumeTraded(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTraded_set(swigCPtr, this, value);
  }

  public int getVolumeTraded() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTraded_get(swigCPtr, this);
  }

  public void setVolumeTotal(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTotal_set(swigCPtr, this, value);
  }

  public int getVolumeTotal() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_VolumeTotal_get(swigCPtr, this);
  }

  public void setInsertDate(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_InsertDate_set(swigCPtr, this, value);
  }

  public String getInsertDate() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_InsertDate_get(swigCPtr, this);
  }

  public void setInsertTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_InsertTime_set(swigCPtr, this, value);
  }

  public String getInsertTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_InsertTime_get(swigCPtr, this);
  }

  public void setActiveTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ActiveTime_set(swigCPtr, this, value);
  }

  public String getActiveTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ActiveTime_get(swigCPtr, this);
  }

  public void setSuspendTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_SuspendTime_set(swigCPtr, this, value);
  }

  public String getSuspendTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_SuspendTime_get(swigCPtr, this);
  }

  public void setUpdateTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_UpdateTime_set(swigCPtr, this, value);
  }

  public String getUpdateTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_UpdateTime_get(swigCPtr, this);
  }

  public void setCancelTime(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_CancelTime_set(swigCPtr, this, value);
  }

  public String getCancelTime() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_CancelTime_get(swigCPtr, this);
  }

  public void setActiveTraderID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_set(swigCPtr, this, value);
  }

  public String getActiveTraderID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ActiveTraderID_get(swigCPtr, this);
  }

  public void setClearingPartID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_ClearingPartID_set(swigCPtr, this, value);
  }

  public String getClearingPartID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_ClearingPartID_get(swigCPtr, this);
  }

  public void setSequenceNo(int value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_SequenceNo_set(swigCPtr, this, value);
  }

  public int getSequenceNo() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_SequenceNo_get(swigCPtr, this);
  }

  public void setBranchID(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_BranchID_set(swigCPtr, this, value);
  }

  public String getBranchID() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_BranchID_get(swigCPtr, this);
  }

  public void setIPAddress(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_IPAddress_set(swigCPtr, this, value);
  }

  public String getIPAddress() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_IPAddress_get(swigCPtr, this);
  }

  public void setMacAddress(String value) {
    thosttraderapiJNI.CThostFtdcExchangeOrderField_MacAddress_set(swigCPtr, this, value);
  }

  public String getMacAddress() {
    return thosttraderapiJNI.CThostFtdcExchangeOrderField_MacAddress_get(swigCPtr, this);
  }

  public CThostFtdcExchangeOrderField() {
    this(thosttraderapiJNI.new_CThostFtdcExchangeOrderField(), true);
  }

}
