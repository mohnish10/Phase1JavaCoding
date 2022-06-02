package com.simplilearn.basics;
class PositiveProcessor extends Processor{
public PositiveProcessor(Processor nextProcessor)
{
super(nextProcessor);	
}
public void process(Number request)
{
if(request.getNumber()>0)
{
System.out.println("Positive processor :-"+request.getNumber());	
}
else
{
super.process(request);	
}
}
}
