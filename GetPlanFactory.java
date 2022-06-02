package com.simplilearn.basics;
class GetPlanFactory {
public Plan getPlan(String planType)
{
if(planType == null)
{
return null;	
}
if(planType.equalsIgnoreCase("DOMESTIC PLAN"))
{
return new DomesticPlan();	
}
else if(planType.equalsIgnoreCase("COMMERCIAL PLAN"))
{
return new CommercialPlan();	
}
else if(planType.equalsIgnoreCase("INSTIUTIONAL PLAN"))
{
return new InstitutionalPlan();
}
return null;
}
}

