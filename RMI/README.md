mwt
===
CMD1 CMD2 CMD3 are command prompts in windows
---
Steps:
---
1.Download and save these files as .java
---
2.Execute the and generate class files
---
3.Follow the below commands

`
CMD1>rmic -v1.1 DNSLookupImpl
`

`
CMD1>start rmiregistry
`

`
CMD2>java Server
`

`
CMD3>java RMIClient
`
