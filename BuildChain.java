package com.simplilearn.basics;
abstract class Processor
{
private Processor nextProcessor;
public Processor(Processor nextProcessor)
{
this.nextProcessor = nextProcessor;	
};
public void process(Number request)
{
if(nextProcessor!= null)
nextProcessor.process(request);	
};
}
