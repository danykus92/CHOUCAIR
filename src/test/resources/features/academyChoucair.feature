#Autor:danykus
@stories

Feature: Aacademy Choucair
    As user, want to laern how to automate in  screamplay at the Choucair Academy the automation course

    @scenario1
    Scenario Outline: Search for automation course
        Given than brandon wants to learn automation at the academy Choucair
            | strUser            | strPassword        |
            | <strUser>          | <strPassword>      |
        When he search for course on the choucair academy platform
            | strCourse             |
            | <strCourse>           |
        Then he finds the course called
            | strCourse             |
            | <strCourse>           |

        Examples:
            | strUser            | strPassword        |  strCourse            |
            | 1067911036         | Choucair2021*      | Foundation Express    |

