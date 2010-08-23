<?xml version="1.0" encoding="UTF-8"?>
<SCL xmlns="http://www.iec.ch/61850/2003/SCL" xmlns:sxy="http://www.iec.ch/61850/2003/SCLcoordinates">
  <Header id="Subestacion PTI 1" nameStructure="IEDName" revision="R0.0" toolID="HELINKS STS" version="V0.0">
    <History>
      <Hitem revision="R0.1" version="V0.0" what="All" when="Sun Aug 22 19:55:48 VET 2010" who="No User Set" why="Build"/>
    </History>
  </Header>
  <Substation name="SubstationPTI">
    <PowerTransformer name="TX-RX" sxy:dir="horizontal" type="PTR">
      <LNode lnClass="YPTR" lnInst="1" prefix=""/>
      <TransformerWinding name="W2">
        <Terminal connectivityNode="SubstationPTI/VL500/Bay_5/L" name="T1"/>
      </TransformerWinding>
      <TransformerWinding name="W1">
        <Terminal connectivityNode="SubstationPTI/VL220/Bay_6/L" name="T1"/>
      </TransformerWinding>
    </PowerTransformer>
    <VoltageLevel name="VL500">
      <Voltage multiplier="k" unit="V">500</Voltage>
      <Bay name="BayBarraA">
        <ConductingEquipment name="TP1" type="VTR">
          <Terminal bayName="BayBarraA" cNodeName="LA" connectivityNode="SubstationPTI/VL500/BayBarraA/LA" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode desc="Conectivity node de la barra A" name="LA" pathName="SubstationPTI/VL500/BayBarraA/LA"/>
      </Bay>
      <Bay name="Bay_1">
        <ConductingEquipment name="Int" type="CBR">
          <LNode lnClass="XCBR" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_1" cNodeName="L01" connectivityNode="SubstationPTI/VL500/Bay_1/L01" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_1" cNodeName="L02" connectivityNode="SubstationPTI/VL500/Bay_1/L02" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment desc="" name="Sec" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="BayBarraA" cNodeName="LA" connectivityNode="SubstationPTI/VL500/BayBarraA/LA" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_1" cNodeName="L01" connectivityNode="SubstationPTI/VL500/Bay_1/L01" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="Sec" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_1" cNodeName="L03" connectivityNode="SubstationPTI/VL500/Bay_1/L03" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_1" cNodeName="L04" connectivityNode="SubstationPTI/VL500/Bay_1/L04" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="TC" type="CTR">
          <Terminal bayName="Bay_1" cNodeName="L02" connectivityNode="SubstationPTI/VL500/Bay_1/L02" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_1" cNodeName="L03" connectivityNode="SubstationPTI/VL500/Bay_1/L03" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode desc="" name="L01" pathName="SubstationPTI/VL500/Bay_1/L01"/>
        <ConnectivityNode name="L02" pathName="SubstationPTI/VL500/Bay_1/L02"/>
        <ConnectivityNode name="L03" pathName="SubstationPTI/VL500/Bay_1/L03"/>
        <ConnectivityNode name="L04" pathName="SubstationPTI/VL500/Bay_1/L04"/>
      </Bay>
      <Bay name="Bay_2">
        <ConductingEquipment name="Sec3" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_1" cNodeName="L04" connectivityNode="SubstationPTI/VL500/Bay_1/L04" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_2" cNodeName="L05" connectivityNode="SubstationPTI/VL500/Bay_2/L05" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="Int2" type="CBR">
          <LNode lnClass="XCBR" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_2" cNodeName="L05" connectivityNode="SubstationPTI/VL500/Bay_2/L05" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_2" cNodeName="L06" connectivityNode="SubstationPTI/VL500/Bay_2/L06" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="Sec4" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_2" cNodeName="L07" connectivityNode="SubstationPTI/VL500/Bay_2/L07" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_2" cNodeName="L08" connectivityNode="SubstationPTI/VL500/Bay_2/L08" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="TC2" type="CTR">
          <Terminal bayName="Bay_2" cNodeName="L06" connectivityNode="SubstationPTI/VL500/Bay_2/L06" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_2" cNodeName="L07" connectivityNode="SubstationPTI/VL500/Bay_2/L07" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode name="L05" pathName="SubstationPTI/VL500/Bay_2/L05"/>
        <ConnectivityNode name="L06" pathName="SubstationPTI/VL500/Bay_2/L06"/>
        <ConnectivityNode name="L07" pathName="SubstationPTI/VL500/Bay_2/L07"/>
        <ConnectivityNode name="L08" pathName="SubstationPTI/VL500/Bay_2/L08"/>
      </Bay>
      <Bay name="Bay_3">
        <ConductingEquipment name="Sec5" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_2" cNodeName="L08" connectivityNode="SubstationPTI/VL500/Bay_2/L08" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_3" cNodeName="L09" connectivityNode="SubstationPTI/VL500/Bay_3/L09" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="Int3" type="CBR">
          <LNode lnClass="XCBR" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_3" cNodeName="L09" connectivityNode="SubstationPTI/VL500/Bay_3/L09" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_3" cNodeName="L10" connectivityNode="SubstationPTI/VL500/Bay_3/L10" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="Sec6" type="DIS">
          <LNode lnClass="XSWI" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_3" cNodeName="L11" connectivityNode="SubstationPTI/VL500/Bay_3/L11" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_BarraB" cNodeName="LB" connectivityNode="SubstationPTI/VL500/Bay_BarraB/LB" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="TC3" type="CTR">
          <Terminal bayName="Bay_3" cNodeName="L10" connectivityNode="SubstationPTI/VL500/Bay_3/L10" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_3" cNodeName="L11" connectivityNode="SubstationPTI/VL500/Bay_3/L11" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode name="L09" pathName="SubstationPTI/VL500/Bay_3/L09"/>
        <ConnectivityNode desc="" name="L10" pathName="SubstationPTI/VL500/Bay_3/L10"/>
        <ConnectivityNode name="L11" pathName="SubstationPTI/VL500/Bay_3/L11"/>
      </Bay>
      <Bay name="Bay_BarraB">
        <ConductingEquipment name="TP2" type="VTR">
          <Terminal bayName="Bay_BarraB" cNodeName="LB" connectivityNode="SubstationPTI/VL500/Bay_BarraB/LB" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode name="LB" pathName="SubstationPTI/VL500/Bay_BarraB/LB"/>
      </Bay>
      <Bay name="Bay_4">
        <ConductingEquipment name="TC4" sxy:dir="horizontal" type="CTR">
          <Terminal bayName="Bay_1" cNodeName="L04" connectivityNode="SubstationPTI/VL500/Bay_1/L04" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_4" cNodeName="L" connectivityNode="SubstationPTI/VL500/Bay_4/L" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConductingEquipment name="F1" sxy:dir="horizontal" type="IFL">
          <LNode lnClass="PTRC" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_4" cNodeName="L" connectivityNode="SubstationPTI/VL500/Bay_4/L" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
        </ConductingEquipment>
        <ConductingEquipment name="TP3" type="VTR">
          <Terminal bayName="Bay_4" cNodeName="L" connectivityNode="SubstationPTI/VL500/Bay_4/L" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode name="L" pathName="SubstationPTI/VL500/Bay_4/L"/>
      </Bay>
      <Bay name="Bay_5">
        <ConductingEquipment name="TC5" sxy:dir="horizontal" type="CTR">
          <Terminal bayName="Bay_2" cNodeName="L08" connectivityNode="SubstationPTI/VL500/Bay_2/L08" name="T1" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <Terminal bayName="Bay_5" cNodeName="L" connectivityNode="SubstationPTI/VL500/Bay_5/L" name="T2" substationName="SubstationPTI" voltageLevelName="VL500"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConnectivityNode name="L" pathName="SubstationPTI/VL500/Bay_5/L"/>
      </Bay>
    </VoltageLevel>
    <VoltageLevel name="VL220">
      <Bay name="Bay_6">
        <ConductingEquipment name="TC6" sxy:dir="horizontal" type="CTR">
          <Terminal bayName="Bay_6" cNodeName="L" connectivityNode="SubstationPTI/VL220/Bay_6/L" name="T1" substationName="SubstationPTI" voltageLevelName="VL220"/>
          <Terminal bayName="Bay_6" cNodeName="L_1" connectivityNode="SubstationPTI/VL220/Bay_6/L_1" name="T2" substationName="SubstationPTI" voltageLevelName="VL220"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TCTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConductingEquipment name="TP4" type="VTR">
          <Terminal bayName="Bay_6" cNodeName="L_1" connectivityNode="SubstationPTI/VL220/Bay_6/L_1" name="T1" substationName="SubstationPTI" voltageLevelName="VL220"/>
          <SubEquipment name="L1" phase="A">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L2" phase="B">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
          <SubEquipment name="L3" phase="C">
            <LNode lnClass="TVTR"/>
          </SubEquipment>
        </ConductingEquipment>
        <ConductingEquipment name="F2" sxy:dir="horizontal" type="IFL">
          <LNode lnClass="PTRC" lnInst="1" prefix=""/>
          <Terminal bayName="Bay_6" cNodeName="L_1" connectivityNode="SubstationPTI/VL220/Bay_6/L_1" name="T1" substationName="SubstationPTI" voltageLevelName="VL220"/>
        </ConductingEquipment>
        <ConnectivityNode name="L" pathName="SubstationPTI/VL220/Bay_6/L"/>
        <ConnectivityNode name="L_1" pathName="SubstationPTI/VL220/Bay_6/L_1"/>
      </Bay>
    </VoltageLevel>
  </Substation>
</SCL>