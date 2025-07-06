package net.ecorp.samples.multimodule

import net.ecorp.samples.apis.herenvolk.HerenVolkMainEntrypoint
import net.ecorp.samples.talithacumi.TalithaCumiMainEntryPoint

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!-${HerenVolkMainEntrypoint().create()}-${TalithaCumiMainEntryPoint().create()}"
    }
}