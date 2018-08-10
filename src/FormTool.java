import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FormTool {
	public static void main(String args[]){
		
		FormTool ft = new FormTool();
//		ft.formtool("aaa,bbb");
//		ft.settool("otherDiagnosis bloodSpecimenTime edta heparinLithiumAnticoagulation cerebrospinalTime cerebrospinalFluid");
	
//		ft.optiontool("0呼吸道感染 1其他感染 2手术 3精神紧张 4全身基础疾病 5（激素/免疫抑制剂/其他）减药或停药 6可能加重MG症状的药物 7其他诱因");
		
	
//		ft.formtoolAdvance("int jollyTest;int jollyTestDetail;int neostigmineTest;String neostigmineTestAbsolute;String neostigmineTestRelative;int IceTest;String IceTestEyeMuscle;String IceTestScore;int SleepTest;int emg;String rns;String sfemg;String emg_oth;String emg_res;String lowFrequencies;String highFrequencies;String extendedInterval;int serumAntibody;int serumAntibodyDetail;String paraneoplasticAntibody;int otherSerumAntibodies;String qntibodyTiter1;String qntibodyTiter2;String qntibodyTiter3;");

//		ft.settoolAdvance("int jollyTest;int jollyTestDetail;int neostigmineTest;String neostigmineTestAbsolute;String neostigmineTestRelative;int IceTest;String IceTestEyeMuscle;String IceTestScore;int SleepTest;int emg;String rns;String sfemg;String emg_oth;String emg_res;String lowFrequencies;String highFrequencies;String extendedInterval;int serumAntibody;int serumAntibodyDetail;String paraneoplasticAntibody;int otherSerumAntibodies;String qntibodyTiter1;String qntibodyTiter2;String qntibodyTiter3;");

//		ft.settoolAdvance("int hospitalized;int medicine1;int medicine2;int medicine3;int medicine4;int medicine5;int medicine6;int medicine7;String dose1;String usage1;String dose2;String usage2;String dose3;String usage3;String dose4;String usage4;String dose5;String usage5;String dose6;String usage6;String dose7;String usage7;int meiluohua;String meiluohuaUsage;int thymectomy;int thymusTreatment;int mgCrisis;int mgCrisisType;int mgCrisisIncentive;int icu;int assistedVentilation;int medicine1_mg;int medicine2_mg;int medicine3_mg;int medicine4_mg;int medicine5_mg;int medicine6_mg;int medicine7_mg;String dose1_mg;String usage1_mg;String dose2_mg;String usage2_mg;String dose3_mg;String usage3_mg;String dose4_mg;String usage4_mg;String dose5_mg;String usage5_mg;String dose6_mg;String usage6_mg;String dose7_mg;String usage7_mg;int dischargeDiagnosis;String dischargeDiagnosisDescr;int ossermanClassification;String otherDiagnosis;int dischargeSituation;String physicalExamination;String mgAbsoluteScore;String mocaScore_discharged;String mmseScore_discharged;String hamdScore_discharged;String hamaScore_discharged;String mrs_discharged;int dischargePlan;int medicine1_discharge;int medicine2_discharge;int medicine3_discharge;int medicine4_discharge;int medicine5_discharge;int medicine6_discharge;int medicine7_discharge;String dose1_discharge;String usage1_discharge;String dose2_discharge;String usage2_discharge;String dose3_discharge;String usage3_discharge;String dose4_discharge;String usage4_discharge;String dose5_discharge;String usage5_discharge;String dose6_discharge;String usage6_discharge;String dose7_discharge;String usage7_discharge;int complication;String complicationDesc;int adverseReactions;String adverseReactionsMed;String adverseReactionsDes;String remark;");
	
//		ft.formtoolAdvance("int hospitalized;int medicine1;int medicine2;int medicine3;int medicine4;int medicine5;int medicine6;int medicine7;String dose1;String usage1;String dose2;String usage2;String dose3;String usage3;String dose4;String usage4;String dose5;String usage5;String dose6;String usage6;String dose7;String usage7;int meiluohua;String meiluohuaUsage;int thymectomy;int thymusTreatment;int mgCrisis;int mgCrisisType;int mgCrisisIncentive;int icu;int assistedVentilation;int medicine1_mg;int medicine2_mg;int medicine3_mg;int medicine4_mg;int medicine5_mg;int medicine6_mg;int medicine7_mg;String dose1_mg;String usage1_mg;String dose2_mg;String usage2_mg;String dose3_mg;String usage3_mg;String dose4_mg;String usage4_mg;String dose5_mg;String usage5_mg;String dose6_mg;String usage6_mg;String dose7_mg;String usage7_mg;int dischargeDiagnosis;String dischargeDiagnosisDescr;int ossermanClassification;String otherDiagnosis;int dischargeSituation;String physicalExamination;String mgAbsoluteScore;String mocaScore_discharged;String mmseScore_discharged;String hamdScore_discharged;String hamaScore_discharged;String mrs_discharged;int dischargePlan;int medicine1_discharge;int medicine2_discharge;int medicine3_discharge;int medicine4_discharge;int medicine5_discharge;int medicine6_discharge;int medicine7_discharge;String dose1_discharge;String usage1_discharge;String dose2_discharge;String usage2_discharge;String dose3_discharge;String usage3_discharge;String dose4_discharge;String usage4_discharge;String dose5_discharge;String usage5_discharge;String dose6_discharge;String usage6_discharge;String dose7_discharge;String usage7_discharge;int complication;String complicationDesc;int adverseReactions;String adverseReactionsMed;String adverseReactionsDes;String remark;");

		
//		ft.optiontoolUpdateDunhao("0：视神经、1：脊髓、2：大脑、3：间脑、4：脑干、5：最后区、6：多部位");
		
		ft.optiontoolUpdate("medicine1_mg","0:胆碱酯酶抑制剂 1:丙球 2:血浆置换 3:甲强龙 4:地塞米松 5:泼尼松龙 6:美罗华 7:硫唑嘌呤 8:环孢素A 9:他克莫司 10:吗替麦考酚 11:环磷酰胺");
	}
	
	public  void optiontoolUpdateDunhao(String temp){  //0：有、1：无、2：不详
		//输出格式 <option value="0" <c:if test="${register.basicInfoMg.medicalStatus == 0}">selected</c:if>>医保</option>
		String[] strL = temp.split("、");
		System.out.println("<option value=\"-1\">请选择</option>");
		for(int i=0;i<strL.length;i++){
			 System.out.println("<option value=\""+strL[i].charAt(0)+"\" <c:if test=\"${register.treatmentMg.firstConvulsionPlace == "+strL[i].charAt(0)+"}\"> selected</c:if>>"+strL[i].substring(2, strL[i].length())+"</option>");
		}
		System.out.println(strL.length);
	}
	
	public  void optiontoolUpdate(String key,String temp){  //格式0动眼神经 1滑车神经 2三叉神经 3展神经 4面神经 5位听神经 6舌咽神经 7迷走神经 8副神经 9舌下神经
		//输出格式 <option value="0" <c:if test="${register.basicInfoMg.medicalStatus == 0}">selected</c:if>>医保</option>
		String[] strL = temp.split(" ");
		System.out.println("<option value=\"-1\">请选择</option>");
		for(int i=0;i<strL.length;i++){
			 System.out.println("<option value=\""+strL[i].charAt(0)+"\" <c:if test=\"${register.treatmentMg."+key+" == "+strL[i].charAt(0)+"}\"> selected</c:if>>"+strL[i].substring(2, strL[i].length())+"</option>");
		}
		System.out.println(strL.length);
	}
	
	public  void optiontool(String temp){  //格式0动眼神经 1滑车神经 2三叉神经 3展神经 4面神经 5位听神经 6舌咽神经 7迷走神经 8副神经 9舌下神经
		//输出格式 <option value="0">感染</option>
		String[] strL = temp.split(" ");
		System.out.println("<option value=\"-1\">请选择</option>");
		for(int i=0;i<strL.length;i++){
			 System.out.println("<option value=\""+strL[i].charAt(0)+"\">"+strL[i].substring(1, strL[i].length())+"</option>");
		}
		System.out.println(strL.length);
	}
	
	//正则表达式(?<=AAA).*?(?=BBB)
	public  void formtoolAdvance(String temp){  //格式int convulsionStatus;int followStatus;int followFunction;String hospitalizedNum;
		String[] strL = temp.split(";");
		for(int i=0;i<strL.length;i++){
			int spaceInde = strL[i].indexOf(" ");
			String keyword = strL[i].substring(spaceInde+1, strL[i].length());
			StringBuilder sb = new StringBuilder();
			 String namePart1 = keyword.substring(0, 1).toUpperCase();
			 String namePart2 = keyword.substring(1);
			 sb.append(namePart1+namePart2);
			 System.out.println(strL[i].substring(0, spaceInde)+" "+keyword+" = form.get"+sb.toString().trim()+"();");
		}
		System.out.println(strL.length);
	}
	
	public  void settoolAdvance(String temp){ //格式int convulsionStatus;int followStatus;int followFunction;String hospitalizedNum;
		String[] strL = temp.split(";");
		for(int i=0;i<strL.length;i++){
			int spaceInde = strL[i].indexOf(" ");
			String keyword = strL[i].substring(spaceInde+1, strL[i].length());
			StringBuilder sb = new StringBuilder();
			 String namePart1 = keyword.substring(0, 1).toUpperCase();
			 String namePart2 = keyword.substring(1);
			 sb.append(namePart1+namePart2);
			System.out.println("treatment.set"+sb.toString().trim()+"("+keyword.trim()+");");
		}
		System.out.println(strL.length);

	}
	
	
	public  void formtool(String temp){//格式convulsionStatus followStatus followFunction hospitalizedNum
		String[] strL = temp.split(" ");
		for(int i=0;i<strL.length;i++){
			StringBuilder sb = new StringBuilder();
			 String namePart1 = strL[i].substring(0, 1).toUpperCase();
			 String namePart2 = strL[i].substring(1);
			 sb.append(namePart1+namePart2);
			System.out.println("String "+strL[i]+" = form.get"+sb+"();");
		}
	}
	
	public  void settool(String temp){
		String[] strL = temp.split(" ");
		for(int i=0;i<strL.length;i++){
			StringBuilder sb = new StringBuilder();
			 String namePart1 = strL[i].substring(0, 1).toUpperCase();
			 String namePart2 = strL[i].substring(1);
			 sb.append(namePart1+namePart2);
			System.out.println("bi.set"+sb+"("+strL[i]+");");
		}
	}
	
	
}
