package chipyard

import org.chipsalliance.cde.config.{Config}
import freechips.rocketchip.subsystem._

class ClusteredCoherencyRocketConfig extends Config(
  new chipyard.config.WithUARTInitBaudRate(BigInt(3686400L)) ++
  new freechips.rocketchip.rocket.WithNHugeCores(2, location=InCluster(1)) ++
  new freechips.rocketchip.rocket.WithNHugeCores(2, location=InCluster(0)) ++
  new freechips.rocketchip.subsystem.WithClusterInclusiveCache(1) ++
  new freechips.rocketchip.subsystem.WithClusterInclusiveCache(0) ++
  new freechips.rocketchip.subsystem.WithCluster(1) ++
  new freechips.rocketchip.subsystem.WithCluster(0) ++
  new freechips.rocketchip.subsystem.WithClusterBanks(1) ++
  new freechips.rocketchip.subsystem.WithClusterBanks(0) ++
  new chipyard.config.AbstractConfig)
