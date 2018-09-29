# Answer 1:-
**1.Class Name: Client**

Responsibilities: 

1. Tell manager to book seat by providing info (Name,Cell Phone #, Number of people in the party).

2. Response to sms received regarding booking

Collaborators:

1. Manager

2. SMS Sender

**2.Class Name: Manager**

Responsibilities: 

1. Take request from Client

2. Forward client information to Seat allocator

Collaborators: 

1. Client

2. Seat allocator

**3.Client Name: Seat allocator**

Responsibilities: 

1. Add client in the queue

2. Check if client party is less than available table size

3. Make a request to SMS Sender for sending a sms to client 

Collaborators:

1. Manager

2. SMS Sender

**4.Client Name: SMS Sender**

Responsibilities: 

1. Send sms to given client phone number 

2. Read sms response received from client and send request to Seat allocator

Collaborators: 

1. Seat allocator

2. Client


# Answer 2:-
I choose Observer pattern as my pattern design. Here Seat Allocator is an observer and it is observing table as it’s subject.

Seat allocator: Observer

Table: Subject
