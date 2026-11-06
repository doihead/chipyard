package chipyard

import org.chipsalliance.cde.config.{Config}
import saturn.common.{VectorParams}

class VroomEquivalentShuttleConfig extends Config(
  new saturn.shuttle.WithShuttleVectorUnit(512, 512, VectorParams.genParams) ++
  new chipyard.config.WithSystemBusWidth(256) ++
  new shuttle.common.WithShuttleTileBeatBytes(32) ++
  new shuttle.common.WithL1ICacheWays(1) ++
  new shuttle.common.WithL1ICacheSets(64) ++
  // DCache
  new shuttle.common.WithL1DCacheWays(1) ++
  // new shuttle.common.WithL1DCacheSets(256) ++
  new shuttle.common.WithL1DCacheBanks(1) ++
  new shuttle.common.WithL1DCacheTagBanks(1) ++
  new shuttle.common.WithNShuttleCores(1) ++
  new chipyard.config.AbstractConfig)