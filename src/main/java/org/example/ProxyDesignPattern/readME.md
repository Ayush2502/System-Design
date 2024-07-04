
 Points to Ponder :

 1. Usages
        - When a client interacts with real objects , instead of real interaction we make them interact with the proxy
          of those objects.
        - Used in Access Denied Case, PreProcessing , Post Processing , Caching

 2. Explaination :

    - EmployeeDao: iske paas pure wo functions hai jo hme implement krne hai apne employee k liye
    - EmployeeDaoImpl:  the Concrete Class which has real implementation lekin hm client ko iss class k object ka access nhi denge
    - EmployeeDaoProxyImpl: Is class ko hmne same employeedaoImpl ki tarah banaya hai so that , yeh ek dummy ki tarah kaam kr paaye
                            and iss class me hmne concrete class ki object banayi hai and yaha se use kra tha saare methods of concrete class.

    - Client : jb client access krega to Procy class access krega and validations k according usko operation success or access denied milenge.
