create table activeemployeeinfosample (
	uuid_ VARCHAR(75) null,
	srno LONG not null primary key,
	Milestone VARCHAR(75) null,
	EmpId VARCHAR(75) null,
	Name VARCHAR(75) null,
	Emailid VARCHAR(75) null,
	Reason VARCHAR(75) null,
	Photo VARCHAR(75) null,
	DOJ VARCHAR(75) null,
	ExitOn VARCHAR(75) null,
	Birthday VARCHAR(75) null,
	Anniversary VARCHAR(75) null,
	Business VARCHAR(75) null,
	Unit VARCHAR(75) null,
	GradeGroup VARCHAR(75) null,
	Grade VARCHAR(75) null,
	FunctionName VARCHAR(75) null,
	Department VARCHAR(75) null,
	Designation VARCHAR(75) null,
	Zone VARCHAR(75) null,
	Region VARCHAR(75) null,
	Location VARCHAR(75) null,
	Product VARCHAR(75) null,
	JVBranch VARCHAR(75) null,
	Branch VARCHAR(75) null,
	Costcenter VARCHAR(75) null,
	AreaHandled VARCHAR(75) null,
	gender VARCHAR(75) null
);

create table screennameempidmapping (
	uuid_ VARCHAR(75) null,
	srno LONG not null primary key,
	screenname VARCHAR(75) null,
	empid VARCHAR(75) null
);