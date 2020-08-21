@file:Repository("https://dl.bintray.com/uzzu/sandbox")
@file:DependsOn("co.uzzu.gtool:gtool:0.0.1")

import co.uzzu.gtool.Library

println("Hello ${Library().someLibraryMethod()}")
