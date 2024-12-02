# Cmake
## CLI usage
1. go to the project main directory
2. create and move inside the build directory
3. use the command ``cmake ..`` or ``cmake -G <generator> ..`` if you need to specify a specific generator (ex. in Windows use ``"Unix Makefile"`` to generate a Makefile usable with ``make``)

## CMakeLists.txt
- ``cmake_minimum_required(VERSION 3.10)``
  - specify the minimum version of CMake
  - compatibility with versions of CMake older than 3.10 is deprecated
  - ``FATAL ERROR`` flag is ignored on 2.6 of higher, only for 2.4 or lower
- ``project(projectName VERSION ##)``
  - name of the project
  - ``VERSION ##`` optional, specify the build version
- ``add_executable(execName file1.cpp file2.cpp file3.hpp ...)``
  - create an executable target called ``execName`` built from the source files specified
- ``add_library(libName <type> lib1.h lib1.cpp lib2.hpp ...)``
  - create a library target called ``libName`` built from the source and header files specified
  - ``<type>`` is optional and can be ``STATIC``, ``SHARED`` or ``MODULE``
- ``add_subdirectory(dirName)``
  - add a directory where to look for source files
- ``target_link_libraries(targetName <type> libName)``
  - link ``libName`` library target to a specific ``targetName`` target
  - ``<type>`` can be ``PUBLIC``, ``PRIVATE`` or ``INTERFACE``
- ``target_include_directories(targetName <type> dirName)``
  - specify where the executable or library target should look for the files
  - the directory can be specified with variables: ``"$<PROJECT_BINARY_DIR>"`` or path ``"$<PROJECT_SOURCE_DIR>/include"``
  - ``<type>`` in needed and can be ``PUBLIC``, ``PRIVATE`` or ``INTERFACE``
- ``set/unset(variableName value)``
  - set/unset a specific CMake normal variable
  - use ``PARENT_SCOPE`` to set the variable in the scope above the current one
  - use ``CACHE ...`` to specify a specific cache entry
- ``set/unset(ENV{variableName} value)``
  - set/unset an enviroment CMake variable in the local scope
  - the call of ``$ENV{variableName}`` will return this new value.

## CMake Variables
| VARIABLE | description |
| - | - |
| CMAKE_CXX_STANDARD ## | C++ standard option <br> ``set(CMAKE_CXX_STANDARD 11)`` |
| CMAKE_CXX_STANDARD_REQUIRED True/False | whether the C++ standard is required <br> ``set(CMAKE_CXX_STANDARD_REQUIRED True)`` |
| PROJECT_SOURCE_DIR | path of the source directory of the project specified with ``project()`` command |
| PROJECT_BINARY_DIR | path of the build directory of the project specified with ``project()`` command |
