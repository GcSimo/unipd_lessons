# Git
## Set git variables
set variables in global scope:  
``git config --global user.name "Giacomo Simonetto"``  
``git config --global user.email simonettogiacomo04@gmail.com``  
``git config --global init.defaultBranch main``

check variables' values:  
``git config --get user.name -> Giacomo Simonetto``  
``git config --get user.email -> simonettogiacomo04@gmail.com``  
``git config --get init.defaultBranch -> main``

open .gitconfig file  
``git config --global --edit``

## Manage directory
### Stage and commit files
| Comand         | Description |
| -----------    | ----------- |
| ``git init``   |  create new git directory |
| ``git status`` | see status tracked/untracked/commits/branchs of a directory |
| ``git add filename.ext`` | track/stage filename.ext |
| ``git add --all/-A/.`` | track/stage all files in directory |
| ``git add -p/--patch filename.ext`` | same but you can choose what individual changes in the file you want to stage |
| ``git diff`` | show file differences from last commit |
| ``git diff BranchName`` | show file differences between BranchName and the main branch |
| ``git commit -m "title" -m "description"`` | commit staged files with a commit title and description(optional)|
| ``git commit -a -m "title"`` | commit all files and skip the staging step (only for modified files) |
| ``git commit -m "correct title" -amend `` | to correct the last commit title |
| ``git rm filename.ext`` | remove file |
| ``git rm --cached filename.ext`` | unstage filename.ext file |
| ``git restore filename.ext`` | restore a file to the last commited version |
| ``git restore --staged filename.ext`` | unstage remove filename.ext file  |
| ``git mv oldFilename.ext newFilename.ext`` | rename file |
| ``git log`` | show all commits done |
| ``git log --oneline`` | show in compact all commits done |
| ``git log -p`` | show changes between commits, q for exit |
| ``git reset filename.ext`` | unstage filename.ext file - ## old version of ``git restore --staged`` |
| ``git reset hashtag`` | go back to a previous commit, but keep all changes unstaged |
| ``git reset HEAD~1`` | go back from actual commit (HEAD) to 1 commit before, but keep all changes unstaged |
| ``git reset --hard hashtag`` | go back to a previous commit and delete all the changes |
| ``git rebase -i --root`` | to manage commits (merge,reorder,...) |

In ``git add -p/--patch`` there are some extra actions:
- ``y`` - stage this hunk
- ``n`` - do not stage this hunk
- ``q`` - quit; do not stage this hunk or any of the remaining ones
- ``a`` - stage this hunk and all later hunks in the file
- ``d`` - do not stage this hunk or any of the later hunks in the file
- ``s`` - split the current hunk into smaller hunks
- ``j`` - leave this hunk undecided, see next undecided hunk
- ``J`` - leave this hunk undecided, see next hunk
- ``g`` - select a hunk to go to
- ``/`` - search for a hunk matching the given regex
- ``e`` - manually edit the current hunk
- ``?`` - print help

### Branch
| Comand         | Description |
| -----------    | ----------- |
| ``git branch`` | list all branches with * on the currently used one |
| ``git branch BranchName`` | create new branch called BranchName |
| ``git branch -d BranchName`` | delete BranchName branch |
| ``git switch BranchName`` | switch to BranchName branch |
| ``git switch -c NewBranch`` | create NewBranch and switch to that branch |
| ``git checkout BranchName`` | same as ``git switch BranchName`` |
| ``git checkout -b NewBranch`` | same as ``git switch -c NewBranch`` |
| ``git merge -m "description" BranchName`` | merge BranchName into main with description |
| ``git merge --abort`` | abort a merge process |

Files in Explorer reflects the current branch used, if I change a file in Branch1 and I switch to Branch2,
I don't see the changes, because they were done in a different branch. 

In case of merge conflict, it automatically switch to a main|MERGING branch and files that generate the
conflict contain the two versions:
- ``<<<<<<< HEAD`` contains the main branch version
- ``=======`` separate the two versions
- ``>>>>>>> BranchToMerge`` contains the BranchToMerge version

To decide what version to keep, delete the discarded one and delete ``<<...``, ``==...``, ``>>...`` indicators.
At the end you have to commit the changes to end the merge process.

## .gitignore
to ignore files from git tracking  
ex. ``*.txt`` ignore all .txt files  
ex. ``*.exe`` ignore all .exe files  

use # for comment lines in .gitignore file

# GitHub
## Set new directory
| Comand         | Description |
| -----------    | ----------- |
| ``git clone https://github.com/repoUrl LocalRepoName`` | clone a github repo in a LocalRepoName directory |
| ``git remote add origin https://github.com/repoUrl`` | create a remote connection called origin to a github repo |
| ``git remote set-url origin https://github.com/repoUrl`` | update the origin remote connection url |
| ``git remote -v`` | show existing remote connections |
| ``git branch -M main`` | set ``main`` as the default branch |
| ``git push origin main`` | push content of the main branch from local repo to github cloud repo |
| ``git push -u origin main`` | like before, but add "origin main" as default and the next time you can simply do ``git push`` |
| ``git push --set-upstream origin BranchName`` | same as ``git push -u origin main`` |
| ``git push --all`` | push all local branches to github |

## Issues and Pull request
Create an Issue to tell about a bug, a suggestion,... to improve the code.

Create a pull request to ask someone else to revise the changes you made in a specific branch before directly
merge them to the main branch. It's possible to connect the pull request to an Issue with the Development option
on the left. When a pull request connected to the issue is merged, the connecte issue is automatically closed.

## Keep repos updated
| Comand         | Description |
| -----------    | ----------- |
| ``git fetch`` | download all history from the github repo |
| ``git merge`` | merge changes from the github repo to the local repo |
| ``git pull`` | combine fetch and merge commands |
