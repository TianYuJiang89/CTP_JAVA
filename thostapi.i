%module(directors="1") thosttraderapi 
%include "various.i"
%apply char **STRING_ARRAY { char *ppInstrumentID[] }
%{ 
#include "ThostFtdcMdApi.h"
#include "ThostFtdcTraderApi.h"
%} 
%feature("director") CThostFtdcMdSpi;
%include "ThostFtdcUserApiDataType.h"
%include "ThostFtdcUserApiStruct.h" 
%include "ThostFtdcMdApi.h"
%feature("director") CThostFtdcTraderSpi;
%include "ThostFtdcTraderApi.h"
