/***********************************************
 * aliceEvent.java :
 ***********************************************/

package com.alice.cep;

abstract public class aliceEvent
{
    public aliceEvent()
    {
    }
    
    abstract public boolean  setValues( String[] aArgv );
    abstract public int      length();
    abstract public String   toString();
    abstract public String[] getValues();
}
