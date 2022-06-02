package com.simplilearn.basics;
class ZeroProcessor extends Processor{
public ZeroProcessor(Processor nextProcessor)
{
super(nextProcessor);	
}
public void process(Number request)
{
if(request.getNumber() ==0)
{	
System.out.println("Zeroprocessor -"+request.getNumber());
}
else
{
super.process(request);	
}
}
}
