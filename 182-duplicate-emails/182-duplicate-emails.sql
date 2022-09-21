SELECT Email
From Person
Group By Email
Having Count(*) > 1