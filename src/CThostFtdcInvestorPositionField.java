/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package ctp.thostapi;

public class CThostFtdcInvestorPositionField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcInvestorPositionField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcInvestorPositionField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        thosttraderapiJNI.delete_CThostFtdcInvestorPositionField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setInstrumentID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_InstrumentID_set(swigCPtr, this, value);
  }

  public String getInstrumentID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_InstrumentID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_BrokerID_get(swigCPtr, this);
  }

  public void setInvestorID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_InvestorID_set(swigCPtr, this, value);
  }

  public String getInvestorID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_InvestorID_get(swigCPtr, this);
  }

  public void setPosiDirection(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PosiDirection_set(swigCPtr, this, value);
  }

  public char getPosiDirection() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PosiDirection_get(swigCPtr, this);
  }

  public void setHedgeFlag(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_HedgeFlag_set(swigCPtr, this, value);
  }

  public char getHedgeFlag() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_HedgeFlag_get(swigCPtr, this);
  }

  public void setPositionDate(char value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionDate_set(swigCPtr, this, value);
  }

  public char getPositionDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionDate_get(swigCPtr, this);
  }

  public void setYdPosition(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_YdPosition_set(swigCPtr, this, value);
  }

  public int getYdPosition() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_YdPosition_get(swigCPtr, this);
  }

  public void setPosition(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_Position_set(swigCPtr, this, value);
  }

  public int getPosition() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_Position_get(swigCPtr, this);
  }

  public void setLongFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_LongFrozen_set(swigCPtr, this, value);
  }

  public int getLongFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_LongFrozen_get(swigCPtr, this);
  }

  public void setShortFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_ShortFrozen_set(swigCPtr, this, value);
  }

  public int getShortFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_ShortFrozen_get(swigCPtr, this);
  }

  public void setLongFrozenAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_LongFrozenAmount_set(swigCPtr, this, value);
  }

  public double getLongFrozenAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_LongFrozenAmount_get(swigCPtr, this);
  }

  public void setShortFrozenAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_set(swigCPtr, this, value);
  }

  public double getShortFrozenAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_ShortFrozenAmount_get(swigCPtr, this);
  }

  public void setOpenVolume(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenVolume_set(swigCPtr, this, value);
  }

  public int getOpenVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenVolume_get(swigCPtr, this);
  }

  public void setCloseVolume(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseVolume_set(swigCPtr, this, value);
  }

  public int getCloseVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseVolume_get(swigCPtr, this);
  }

  public void setOpenAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenAmount_set(swigCPtr, this, value);
  }

  public double getOpenAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenAmount_get(swigCPtr, this);
  }

  public void setCloseAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseAmount_set(swigCPtr, this, value);
  }

  public double getCloseAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseAmount_get(swigCPtr, this);
  }

  public void setPositionCost(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionCost_set(swigCPtr, this, value);
  }

  public double getPositionCost() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionCost_get(swigCPtr, this);
  }

  public void setPreMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PreMargin_set(swigCPtr, this, value);
  }

  public double getPreMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PreMargin_get(swigCPtr, this);
  }

  public void setUseMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_UseMargin_set(swigCPtr, this, value);
  }

  public double getUseMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_UseMargin_get(swigCPtr, this);
  }

  public void setFrozenMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenMargin_set(swigCPtr, this, value);
  }

  public double getFrozenMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenMargin_get(swigCPtr, this);
  }

  public void setFrozenCash(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenCash_set(swigCPtr, this, value);
  }

  public double getFrozenCash() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenCash_get(swigCPtr, this);
  }

  public void setFrozenCommission(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenCommission_set(swigCPtr, this, value);
  }

  public double getFrozenCommission() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_FrozenCommission_get(swigCPtr, this);
  }

  public void setCashIn(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CashIn_set(swigCPtr, this, value);
  }

  public double getCashIn() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CashIn_get(swigCPtr, this);
  }

  public void setCommission(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_Commission_set(swigCPtr, this, value);
  }

  public double getCommission() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_Commission_get(swigCPtr, this);
  }

  public void setCloseProfit(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfit_set(swigCPtr, this, value);
  }

  public double getCloseProfit() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfit_get(swigCPtr, this);
  }

  public void setPositionProfit(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionProfit_set(swigCPtr, this, value);
  }

  public double getPositionProfit() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PositionProfit_get(swigCPtr, this);
  }

  public void setPreSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_PreSettlementPrice_set(swigCPtr, this, value);
  }

  public double getPreSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_PreSettlementPrice_get(swigCPtr, this);
  }

  public void setSettlementPrice(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_SettlementPrice_set(swigCPtr, this, value);
  }

  public double getSettlementPrice() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_SettlementPrice_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_TradingDay_get(swigCPtr, this);
  }

  public void setSettlementID(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_SettlementID_set(swigCPtr, this, value);
  }

  public int getSettlementID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_SettlementID_get(swigCPtr, this);
  }

  public void setOpenCost(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenCost_set(swigCPtr, this, value);
  }

  public double getOpenCost() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_OpenCost_get(swigCPtr, this);
  }

  public void setExchangeMargin(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_ExchangeMargin_set(swigCPtr, this, value);
  }

  public double getExchangeMargin() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_ExchangeMargin_get(swigCPtr, this);
  }

  public void setCombPosition(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CombPosition_set(swigCPtr, this, value);
  }

  public int getCombPosition() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CombPosition_get(swigCPtr, this);
  }

  public void setCombLongFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CombLongFrozen_set(swigCPtr, this, value);
  }

  public int getCombLongFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CombLongFrozen_get(swigCPtr, this);
  }

  public void setCombShortFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CombShortFrozen_set(swigCPtr, this, value);
  }

  public int getCombShortFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CombShortFrozen_get(swigCPtr, this);
  }

  public void setCloseProfitByDate(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfitByDate_set(swigCPtr, this, value);
  }

  public double getCloseProfitByDate() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfitByDate_get(swigCPtr, this);
  }

  public void setCloseProfitByTrade(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_set(swigCPtr, this, value);
  }

  public double getCloseProfitByTrade() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_CloseProfitByTrade_get(swigCPtr, this);
  }

  public void setTodayPosition(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_TodayPosition_set(swigCPtr, this, value);
  }

  public int getTodayPosition() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_TodayPosition_get(swigCPtr, this);
  }

  public void setMarginRateByMoney(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_MarginRateByMoney_set(swigCPtr, this, value);
  }

  public double getMarginRateByMoney() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_MarginRateByMoney_get(swigCPtr, this);
  }

  public void setMarginRateByVolume(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_MarginRateByVolume_set(swigCPtr, this, value);
  }

  public double getMarginRateByVolume() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_MarginRateByVolume_get(swigCPtr, this);
  }

  public void setStrikeFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_StrikeFrozen_set(swigCPtr, this, value);
  }

  public int getStrikeFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_StrikeFrozen_get(swigCPtr, this);
  }

  public void setStrikeFrozenAmount(double value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_set(swigCPtr, this, value);
  }

  public double getStrikeFrozenAmount() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_StrikeFrozenAmount_get(swigCPtr, this);
  }

  public void setAbandonFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_AbandonFrozen_set(swigCPtr, this, value);
  }

  public int getAbandonFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_AbandonFrozen_get(swigCPtr, this);
  }

  public void setExchangeID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_ExchangeID_set(swigCPtr, this, value);
  }

  public String getExchangeID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_ExchangeID_get(swigCPtr, this);
  }

  public void setYdStrikeFrozen(int value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_set(swigCPtr, this, value);
  }

  public int getYdStrikeFrozen() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_YdStrikeFrozen_get(swigCPtr, this);
  }

  public void setInvestUnitID(String value) {
    thosttraderapiJNI.CThostFtdcInvestorPositionField_InvestUnitID_set(swigCPtr, this, value);
  }

  public String getInvestUnitID() {
    return thosttraderapiJNI.CThostFtdcInvestorPositionField_InvestUnitID_get(swigCPtr, this);
  }

  public CThostFtdcInvestorPositionField() {
    this(thosttraderapiJNI.new_CThostFtdcInvestorPositionField(), true);
  }

}
