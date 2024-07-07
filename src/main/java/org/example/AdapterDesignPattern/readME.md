
Usages: 
    - XML to JSON parser and vice versa
    - PowerAdapter incompatible to socket directly has a medium of conversion. 

When we have an existing product has returns a type of data/response which is incompatible by the client . 
We use some adapter/medium which can change the actual response to the desired response . In those scenario, we use 
Adapter Design Pattern. 


UML : 

      client  -----------> (Interface)weight in kg (Adapter)
                                |
                                |
                              is -a
                                |
                                |
                                v
                            Concrete Implementation
                            of Adapter Interface  --------has-a-----------> (Interface) weight in pounds(Adaptee)
                                                                                                    |
                                                                                                    |   
                                                                                                    Concrete impl of Adaptee class.


 - Adapter Interface k impl class  k paas Adaptee Interface ka object hai jaha se wo weight in pound ka data aagya 
 - Uske baad hmare Adapter class ne usko convert krke return kr diya answer 
 - Client ko hm Adapter class k getWeightInKgs() ka access denge jaha se usko desired result mil jaayega 
 - Adapter Interface as a medium of conversion kaam kr rha hai yaha.
