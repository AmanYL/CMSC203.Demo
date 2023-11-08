
public class ManagementCompanyDriverClass {

	public static void main(String[] args) {
		Property sampleProperty1 = new Property ("Sunsational", "Beckman", 2613.0, "BillyBob Wilson",2,5,2,2);
		Property sampleProperty2 = new Property ("TezeraDynamics", "Wuchale", 4844.0, "Menlik and Tayitu",6,8,2,2);
		Property sampleProperty3 = new Property ("Basha.Tela.Ebate", "Shiro Meda", 4114.0, "ጳስታ እና ዳጊ ኮስታ",0,0,2,2);
		Property sampleProperty4 = new Property ("CakeFromJimma", "Sodo", 34905.0, "Anwar",9,8,1,2);
//		Property sampleProperty5 = new Property ("Kitfo", "GuragaeHager", 2613.0, "Alex",6,2,5,4);
//		Property sampleProperty6 = new Property ("Burger", "Wollo", 5327.0, "No_owner",9,2,1,4);
//		
//		ManagementCompany managementCo = new ManagementCompany("Railey", "555555555",6);
//		managementCo.addProperty(sampleProperty1);
//		managementCo.addProperty(sampleProperty2);
//		managementCo.addProperty(sampleProperty3);
//		managementCo.addProperty(sampleProperty4);
//		managementCo.addProperty(sampleProperty6);
//		
////		System.out.println(managementCo.addProperty(sampleProperty5));
////		System.out.println(sampleProperty5.getPlot().overlaps(sampleProperty6.getPlot()));
////		System.out.println(managementCo.getPlot().overlaps(sampleProperty6.getPlot()));
//		System.out.println(managementCo.toString());
//		
////		System.out.println(managementCo.getTotalRent());
////		System.out.println(sampleProperty6);
		Property sampleProperty = new Property("Wakanda","Talokan", 5412.0, "T'Challa",4,5,3,2);
		Property anotherProperty = new Property("Bueno","Bahir Dar", 1285.0, "Zemede",1,4,2,3);
//		
		ManagementCompany managementC2 = new ManagementCompany("Berket","3930213",14);
		managementC2.addProperty(sampleProperty);
		managementC2.addProperty(anotherProperty);
		
		
		System.out.println(managementC2.toString());
		

	}

}
